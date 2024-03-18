package ah;

import bh.C2211a;
import bh.C2221k;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: ah.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1995f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24200Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1996g f24201Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1995f(C1996g c1996g, int i10) {
        super(1);
        this.f24200Y = i10;
        this.f24201Z = c1996g;
    }

    public final void a(C2211a c2211a) {
        v vVar = v.f37483Y;
        int i10 = this.f24200Y;
        C1996g c1996g = this.f24201Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$buildSerialDescriptor", c2211a);
                for (Map.Entry entry : c1996g.f24206e.entrySet()) {
                    c2211a.a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), vVar, false);
                }
                return;
            default:
                AbstractC3557B.c0("$this$buildSerialDescriptor", c2211a);
                c2211a.a("type", u0.f28492b, vVar, false);
                c2211a.a("value", Ad.l.O("kotlinx.serialization.Sealed<" + c1996g.f24202a.o() + '>', C2221k.f26013a, new SerialDescriptor[0], new C1995f(c1996g, 0)), vVar, false);
                List list = c1996g.f24203b;
                AbstractC3557B.c0("<set-?>", list);
                c2211a.f25975b = list;
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f24200Y) {
            case 0:
                a((C2211a) obj);
                return yVar;
            default:
                a((C2211a) obj);
                return yVar;
        }
    }
}
