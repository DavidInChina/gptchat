package Sg;

import nf.C4832l;

/* loaded from: classes2.dex */
public final class m implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16663Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public Object f16664Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f16665h0;

    public m(Ug.g gVar, Ug.b bVar) {
        this.f16664Z = gVar;
        this.f16665h0 = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16663Y;
        Object obj = this.f16665h0;
        switch (i10) {
            case 0:
                int i11 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f16664Z).run();
                    } catch (Throwable th2) {
                        L4.a.A0(C4832l.f40334Y, th2);
                    }
                    n nVar = (n) obj;
                    Runnable w02 = nVar.w0();
                    if (w02 != null) {
                        this.f16664Z = w02;
                        i11++;
                        if (i11 >= 16) {
                            Ng.B b10 = nVar.f16667Z;
                            if (b10.d0(nVar)) {
                                b10.r(nVar, this);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            default:
                ((Ug.f) ((Ug.g) this.f16664Z)).m((Ug.b) obj, jf.y.f36177a);
                return;
        }
    }

    public m(n nVar, Runnable runnable) {
        this.f16665h0 = nVar;
        this.f16664Z = runnable;
    }
}
