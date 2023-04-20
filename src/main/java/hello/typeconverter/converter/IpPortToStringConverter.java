package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {
    @Override
    public String convert(IpPort source) {
        log.info("source = {}", source);
        // IpPort 객체를 -> 127.0.0.1:8080으로 반환
        return source.getIp() + ":" + source.getPort();
    }
}
