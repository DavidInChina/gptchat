package eh;

import bh.C2211a;
import fh.AbstractC3072O;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: eh.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2913m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2913m f29464Z = new C2913m(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2913m f29465h0 = new C2913m(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29466Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2913m(int i10) {
        super(1);
        this.f29466Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f29466Y) {
            case 0:
                C2211a c2211a = (C2211a) obj;
                AbstractC3557B.c0("$this$buildSerialDescriptor", c2211a);
                C2915o c2915o = new C2915o(C2912l.f29458Z);
                kf.v vVar = kf.v.f37483Y;
                c2211a.a("JsonPrimitive", c2915o, vVar, false);
                c2211a.a("JsonNull", new C2915o(C2912l.f29459h0), vVar, false);
                c2211a.a("JsonLiteral", new C2915o(C2912l.f29460i0), vVar, false);
                c2211a.a("JsonObject", new C2915o(C2912l.f29461j0), vVar, false);
                c2211a.a("JsonArray", new C2915o(C2912l.f29462k0), vVar, false);
                return jf.y.f36177a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3557B.c0("<name for destructuring parameter 0>", entry);
                StringBuilder sb2 = new StringBuilder();
                AbstractC3072O.a((String) entry.getKey(), sb2);
                sb2.append(':');
                sb2.append((kotlinx.serialization.json.b) entry.getValue());
                String sb3 = sb2.toString();
                AbstractC3557B.b0("toString(...)", sb3);
                return sb3;
        }
    }
}
