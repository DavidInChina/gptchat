package I2;

import android.os.SystemClock;
import s2.w;

/* loaded from: classes2.dex */
public final /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f7968a;

    public final void a(int i10) {
        int i11;
        g gVar = this.f7968a;
        synchronized (gVar) {
            int i12 = gVar.f7993m;
            if (i12 == 0 || gVar.f7984d) {
                if (i12 != i10) {
                    gVar.f7993m = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        gVar.f7991k = gVar.b(i10);
                        ((w) gVar.f7983c).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (gVar.f7986f > 0) {
                            i11 = (int) (elapsedRealtime - gVar.f7987g);
                        } else {
                            i11 = 0;
                        }
                        gVar.c(gVar.f7988h, i11, gVar.f7991k);
                        gVar.f7987g = elapsedRealtime;
                        gVar.f7988h = 0L;
                        gVar.f7990j = 0L;
                        gVar.f7989i = 0L;
                        p pVar = gVar.f7985e;
                        pVar.f8017b.clear();
                        pVar.f8019d = -1;
                        pVar.f8020e = 0;
                        pVar.f8021f = 0;
                    }
                }
            }
        }
    }
}
