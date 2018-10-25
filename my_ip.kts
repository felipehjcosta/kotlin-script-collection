#!/usr/bin/env kscript

//DEPS khttp:khttp:0.1.0
import khttp.get

// Get our IP
println(get("http://httpbin.org/ip").jsonObject.getString("origin"))
// Get our IP in a simpler way
println(get("http://icanhazip.com").text)