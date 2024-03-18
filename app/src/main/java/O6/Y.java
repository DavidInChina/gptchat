package o6;

import id.AbstractC3557B;
import java.util.Map;
import m6.C4562a;
import p5.EnumC5090b;

/* loaded from: classes2.dex */
public final class Y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40739Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ a0 f40740Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4562a f40741h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(a0 a0Var, C4562a c4562a, int i10) {
        super(1);
        this.f40739Y = i10;
        this.f40740Z = a0Var;
        this.f40741h0 = c4562a;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40739Y) {
            case 0:
                invoke((Map) obj);
                return yVar;
            default:
                invoke((Map) obj);
                return yVar;
        }
    }

    public final void invoke(Map map) {
        EnumC5090b enumC5090b = EnumC5090b.f42739Z;
        int i10 = this.f40739Y;
        C4562a c4562a = this.f40741h0;
        a0 a0Var = this.f40740Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("currentRumContext", map);
                if (!AbstractC3557B.K(map.get("session_id"), a0Var.f40791l) || AbstractC3557B.K(map.get("view_id"), a0Var.f40792m)) {
                    map.clear();
                    map.putAll(c4562a.b());
                    return;
                }
                P4.a.m0(a0Var.f40781b.l(), 2, enumC5090b, C4927f.f40851j0, null, false, 56);
                return;
            default:
                AbstractC3557B.c0("currentRumContext", map);
                if (!AbstractC3557B.K(map.get("session_id"), a0Var.f40791l) || AbstractC3557B.K(map.get("view_id"), a0Var.f40792m)) {
                    map.clear();
                    map.putAll(c4562a.b());
                    return;
                }
                P4.a.m0(a0Var.f40781b.l(), 2, enumC5090b, C4927f.f40852k0, null, false, 56);
                return;
        }
    }
}
