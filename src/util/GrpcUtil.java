package util;

import aiinterface.CommandCenter;
import protoc.MessageProto.GrpcCommandCenter;
import protoc.MessageProto.GrpcKey;
import struct.Key;

public class GrpcUtil {
  	
    public static GrpcKey convertKey(Key key) {
    	if (key == null) key = new Key();
    	return GrpcKey.newBuilder()
    			.setA(key.A)
    			.setB(key.B)
    			.setC(key.C)
    			.setD(key.D)
    			.setL(key.L)
    			.setR(key.R)
    			.setU(key.U)
    			.build();
    }
    
    public static GrpcCommandCenter convertCommandCenter(CommandCenter commandCenter) {
    	return GrpcCommandCenter.newBuilder()
    			.addAllSkillKey(commandCenter.getSkillKeys().stream().map(x -> convertKey(x)).toList())
    			.build();
    }
	
}
