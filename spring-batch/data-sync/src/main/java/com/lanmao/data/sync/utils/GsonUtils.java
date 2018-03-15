package com.lanmao.data.sync.utils;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.lanmao.runtime.core.remoting.rest.RestException;

public final class GsonUtils {
	private static Gson gson;

	public static Gson buildGson() {
		if(gson == null){
			GsonBuilder builder = new GsonBuilder();
			builder.registerTypeAdapter(Date.class, new DateTypeAdapter());
			builder.disableHtmlEscaping();
			gson = builder.create();
		}
		return gson;
	}

	private static class DateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {

		@Override
		public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");  
			return new JsonPrimitive(sdf.format(src));
		}

		@Override
		public Date deserialize(JsonElement json, Type type, JsonDeserializationContext cxt) {
			try {
				return new SimpleDateFormat("yyyyMMddHHmmss").parse(json.getAsString());
			} catch (ParseException e) {
				try {
					return new SimpleDateFormat("yyyyMMdd").parse(json.getAsString());
				} catch (ParseException e2) {
					throw new RestException("无法转换为Date类型");
				}
			}
		}
	}

}
