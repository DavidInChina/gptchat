package Gf;

import id.AbstractC3557B;
import o1.C4885I;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class S extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6360Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f6361Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f6362h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u10, W w10) {
        super(0);
        this.f6361Z = u10;
        this.f6362h0 = w10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (((eg.EnumC2893a) r0.f40437c) == eg.EnumC2893a.f29384n0) goto L11;
     */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo122invoke() {
        String str;
        C4885I c4885i;
        int i10 = this.f6360Y;
        W w10 = this.f6362h0;
        U u10 = this.f6361Z;
        switch (i10) {
            case 0:
                u10.getClass();
                Df.v vVar = U.f6365g[1];
                Object mo122invoke = u10.f6367d.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke);
                return w10.m((ug.n) mo122invoke, E.f6338Y);
            default:
                u10.getClass();
                Df.v vVar2 = U.f6365g[0];
                Rf.c cVar = (Rf.c) u10.f6366c.mo122invoke();
                if (cVar != null && (c4885i = cVar.f15500b) != null) {
                    str = c4885i.f40442h;
                    break;
                }
                str = null;
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return w10.f6371Z.getClassLoader().loadClass(Lg.n.z2(str, '/', '.'));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(W w10, U u10) {
        super(0);
        this.f6362h0 = w10;
        this.f6361Z = u10;
    }
}
