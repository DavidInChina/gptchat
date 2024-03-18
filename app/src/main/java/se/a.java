package Se;

import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import livekit.org.webrtc.FrameCryptorFactory;
import livekit.org.webrtc.FrameCryptorKeyProvider;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameCryptorKeyProvider f16578a;

    public a() {
        new LinkedHashMap();
        Charset charset = Lg.a.f11131a;
        byte[] bytes = "LKFrameEncryptionKey".getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        byte[] bytes2 = "LK-ROCKS".getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes2);
        FrameCryptorKeyProvider createFrameCryptorKeyProvider = FrameCryptorFactory.createFrameCryptorKeyProvider(true, bytes, 0, bytes2, -1);
        AbstractC3557B.b0("createFrameCryptorKeyPro\u2026ilureTolerance,\n        )", createFrameCryptorKeyProvider);
        this.f16578a = createFrameCryptorKeyProvider;
    }
}
