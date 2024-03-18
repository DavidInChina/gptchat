package me;

import id.AbstractC3557B;
import jf.C3960j;
import te.C5760d;
import xe.C6405J;
import xe.C6408M;

/* renamed from: me.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4634g extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39202Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f39203Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4634g(int i10, wf.k kVar) {
        super(1);
        this.f39202Y = i10;
        this.f39203Z = kVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Object obj2;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39202Y;
        wf.k kVar = this.f39203Z;
        switch (i10) {
            case 0:
                C4632e c4632e = (C4632e) obj;
                AbstractC3557B.c0("$this$install", c4632e);
                kVar.invoke(c4632e);
                return yVar;
            case 1:
                C5760d c5760d = (C5760d) obj;
                AbstractC3557B.c0("$this$webSocket", c5760d);
                C6408M c6408m = C6408M.f49852e;
                C6405J c6405j = c5760d.f46125a;
                c6405j.e(c6408m);
                c6405j.f49841c = c6405j.f49839a.f49855b;
                kVar.invoke(c5760d);
                return yVar;
            case 2:
                Bg.A a5 = (Bg.A) obj;
                AbstractC3557B.Z(a5);
                return kVar.invoke(a5).toString();
            default:
                Throwable th2 = (Throwable) obj;
                Object obj3 = null;
                try {
                    Throwable th3 = (Throwable) kVar.invoke(th2);
                    boolean K10 = AbstractC3557B.K(th2.getMessage(), th3.getMessage());
                    obj2 = th3;
                    if (!K10) {
                        boolean K11 = AbstractC3557B.K(th3.getMessage(), th2.toString());
                        obj2 = th3;
                        if (!K11) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th4) {
                    obj2 = com.google.android.gms.internal.play_billing.N.w(th4);
                }
                if (!(obj2 instanceof C3960j)) {
                    obj3 = obj2;
                }
                return (Throwable) obj3;
        }
    }
}
