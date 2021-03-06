package cn.silen_dev.dht.message.model;

import cn.silen_dev.dht.bittorrent.bencode.BencodeMap;
import cn.silen_dev.dht.bittorrent.bencode.BencodeString;

/**
 * Created by silen on 17-5-13.
 */
public class GetPeerResponse extends MessageBuilder {
    public GetPeerResponse(String t,BencodeString queryId) {
        super();
        builderType(MessageType.RESPONSE);
        builderT(t);
        BencodeMap map=new BencodeMap();
        map.put(new BencodeString("id"),queryId);
        map.put(new BencodeString("token"),new BencodeString("SILENDEV"));
        map.put(new BencodeString("nodes"),new BencodeString(""));
        builderResponse(map);
    }
}
