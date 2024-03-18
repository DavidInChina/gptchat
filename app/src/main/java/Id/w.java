package id;

import M3.H;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class w {
    public static x a(String str) {
        AbstractC3557B.c0("string", str);
        U3.l G10 = P4.a.G();
        Charset charset = (Charset) G10.f17424h0;
        AbstractC3557B.b0("charsetCode", charset);
        byte[] bytes = str.getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        Charset charset2 = (Charset) G10.f17424h0;
        AbstractC3557B.b0("charsetCode", charset2);
        V6.c C10 = H.C(byteArrayInputStream, charset2);
        P5.c cVar = (P5.c) G10.f17423Z;
        cVar.getClass();
        V6.b bVar = new V6.b(cVar, C10);
        V6.a aVar = bVar.f18407b;
        try {
            List<Map> p12 = Kg.m.p1(bVar.a());
            aVar.f18405a.f18410a.close();
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(p12, 10));
            for (Map map : p12) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new C3565e((String) entry.getValue()));
                }
                arrayList.add(linkedHashMap);
            }
            return new x(arrayList, new u(), kf.v.f37483Y);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    aVar.f18405a.f18410a.close();
                } catch (Throwable th4) {
                    P4.a.m(th2, th4);
                }
                throw th3;
            }
        }
    }

    public final KSerializer serializer() {
        return v.f33129a;
    }
}
