package eh;

import B0.C0197n;
import Z1.t0;
import ah.AbstractC2003n;
import fh.C3059B;
import fh.C3060C;
import fh.C3068K;
import fh.C3071N;
import fh.C3082i;
import fh.C3098y;
import fh.C3099z;
import fh.EnumC3073P;
import id.AbstractC3557B;
import kf.C4288m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;

/* renamed from: eh.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2904d implements AbstractC2003n {

    /* renamed from: d  reason: collision with root package name */
    public static final C2903c f29415d = new AbstractC2904d(new C2909i(false, false, false, false, false, true, "    ", false, false, "type", false, true, null, false, false, EnumC2901a.f29410Z), gh.f.f31643a);

    /* renamed from: a  reason: collision with root package name */
    public final C2909i f29416a;

    /* renamed from: b  reason: collision with root package name */
    public final gh.d f29417b;

    /* renamed from: c  reason: collision with root package name */
    public final t0 f29418c = new t0(2);

    public AbstractC2904d(C2909i c2909i, gh.d dVar) {
        this.f29416a = c2909i;
        this.f29417b = dVar;
    }

    public final Object a(KSerializer kSerializer, kotlinx.serialization.json.b bVar) {
        Decoder decoder;
        AbstractC3557B.c0("deserializer", kSerializer);
        AbstractC3557B.c0("element", bVar);
        if (bVar instanceof kotlinx.serialization.json.c) {
            decoder = new C3059B(this, (kotlinx.serialization.json.c) bVar, null, null);
        } else if (bVar instanceof kotlinx.serialization.json.a) {
            decoder = new C3060C(this, (kotlinx.serialization.json.a) bVar);
        } else if ((bVar instanceof C2918r) || AbstractC3557B.K(bVar, JsonNull.INSTANCE)) {
            decoder = new C3098y(this, (kotlinx.serialization.json.d) bVar);
        } else {
            throw new RuntimeException();
        }
        return decoder.g(kSerializer);
    }

    public final Object b(KSerializer kSerializer, String str) {
        AbstractC3557B.c0("deserializer", kSerializer);
        AbstractC3557B.c0("string", str);
        C3071N c3071n = new C3071N(str);
        Object g10 = new C3068K(this, EnumC3073P.f30847h0, c3071n, kSerializer.getDescriptor(), null).g(kSerializer);
        c3071n.p();
        return g10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final kotlinx.serialization.json.b c(KSerializer kSerializer, Object obj) {
        AbstractC3557B.c0("serializer", kSerializer);
        ?? obj2 = new Object();
        new C3099z(this, new C0197n(5, obj2), 1).w(kSerializer, obj);
        Object obj3 = obj2.f37622Y;
        if (obj3 != null) {
            return (kotlinx.serialization.json.b) obj3;
        }
        AbstractC3557B.C2("result");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, fh.A] */
    public final String d(KSerializer kSerializer, Object obj) {
        char[] cArr;
        Object obj2;
        AbstractC3557B.c0("serializer", kSerializer);
        ?? obj3 = new Object();
        C3082i c3082i = C3082i.f30875c;
        synchronized (c3082i) {
            C4288m c4288m = c3082i.f30873a;
            cArr = null;
            if (c4288m.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = c4288m.removeLast();
            }
            char[] cArr2 = (char[]) obj2;
            if (cArr2 != null) {
                c3082i.f30874b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        obj3.f30792a = cArr;
        try {
            A7.b.z0(this, obj3, kSerializer, obj);
            return obj3.toString();
        } finally {
            obj3.b();
        }
    }
}
