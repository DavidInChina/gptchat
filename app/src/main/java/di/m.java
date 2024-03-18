package di;

import id.AbstractC3557B;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class m extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f28599e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f28600f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ E f28601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, E e10) {
        super(str, true);
        this.f28599e = nVar;
        this.f28601g = e10;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // Zh.a
    public final long a() {
        long a5;
        int i10;
        int i11;
        C2724A[] c2724aArr;
        n nVar = this.f28599e;
        boolean z10 = this.f28600f;
        E e10 = this.f28601g;
        nVar.getClass();
        AbstractC3557B.c0("settings", e10);
        ?? obj = new Object();
        t tVar = nVar.f28603Z;
        synchronized (tVar.f28625D0) {
            synchronized (tVar) {
                E e11 = tVar.f28646x0;
                if (!z10) {
                    E e12 = new E();
                    e12.b(e11);
                    e12.b(e10);
                    e10 = e12;
                }
                obj.f37622Y = e10;
                a5 = e10.a() - e11.a();
                i10 = (a5 > 0L ? 1 : (a5 == 0L ? 0 : -1));
                if (i10 != 0 && !tVar.f28630h0.isEmpty()) {
                    c2724aArr = (C2724A[]) tVar.f28630h0.values().toArray(new C2724A[0]);
                    E e13 = (E) obj.f37622Y;
                    AbstractC3557B.c0("<set-?>", e13);
                    tVar.f28646x0 = e13;
                    tVar.f28638p0.c(new k(tVar.f28631i0 + " onSettings", tVar, obj, 0), 0L);
                }
                c2724aArr = null;
                E e132 = (E) obj.f37622Y;
                AbstractC3557B.c0("<set-?>", e132);
                tVar.f28646x0 = e132;
                tVar.f28638p0.c(new k(tVar.f28631i0 + " onSettings", tVar, obj, 0), 0L);
            }
            try {
                tVar.f28625D0.a((E) obj.f37622Y);
            } catch (IOException e14) {
                tVar.h(e14);
            }
        }
        if (c2724aArr != null) {
            for (C2724A c2724a : c2724aArr) {
                synchronized (c2724a) {
                    c2724a.f28520f += a5;
                    if (i10 > 0) {
                        c2724a.notifyAll();
                    }
                }
            }
            return -1L;
        }
        return -1L;
    }
}
