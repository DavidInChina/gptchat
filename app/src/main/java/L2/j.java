package L2;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final C0884e f10606a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0888i f10607b;

    /* renamed from: c  reason: collision with root package name */
    public C0885f f10608c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10609d;

    public j(AbstractC0886g abstractC0886g, AbstractC0888i abstractC0888i, long j6, long j10, long j11, long j12, long j13, int i10) {
        this.f10607b = abstractC0888i;
        this.f10609d = i10;
        this.f10606a = new C0884e(abstractC0886g, j6, j10, j11, j12, j13);
    }

    public static int b(r rVar, long j6, I2.i iVar) {
        if (j6 == rVar.o()) {
            return 0;
        }
        iVar.f7995b = j6;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
        return b(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, I2.i iVar) {
        while (true) {
            C0885f c0885f = this.f10608c;
            Gi.e.o(c0885f);
            long j6 = c0885f.f10599f;
            long j10 = c0885f.f10600g;
            long j11 = c0885f.f10601h;
            int i10 = ((j10 - j6) > this.f10609d ? 1 : ((j10 - j6) == this.f10609d ? 0 : -1));
            AbstractC0888i abstractC0888i = this.f10607b;
            if (i10 <= 0) {
                this.f10608c = null;
                abstractC0888i.h();
                return b(rVar, j6, iVar);
            }
            long o10 = j11 - rVar.o();
            if (o10 < 0 || o10 > 262144) {
                break;
            }
            rVar.l((int) o10);
            rVar.k();
            C0887h c10 = abstractC0888i.c(rVar, c0885f.f10595b);
            int i11 = c10.f10603a;
            if (i11 != -3) {
                long j12 = c10.f10604b;
                long j13 = c10.f10605c;
                if (i11 != -2) {
                    if (i11 != -1) {
                        if (i11 == 0) {
                            long o11 = j13 - rVar.o();
                            if (o11 >= 0 && o11 <= 262144) {
                                rVar.l((int) o11);
                            }
                            this.f10608c = null;
                            abstractC0888i.h();
                            return b(rVar, j13, iVar);
                        }
                        throw new IllegalStateException("Invalid case");
                    }
                    c0885f.f10598e = j12;
                    c0885f.f10600g = j13;
                    c0885f.f10601h = C0885f.a(c0885f.f10595b, c0885f.f10597d, j12, c0885f.f10599f, j13, c0885f.f10596c);
                } else {
                    c0885f.f10597d = j12;
                    c0885f.f10599f = j13;
                    c0885f.f10601h = C0885f.a(c0885f.f10595b, j12, c0885f.f10598e, j13, c0885f.f10600g, c0885f.f10596c);
                }
            } else {
                this.f10608c = null;
                abstractC0888i.h();
                return b(rVar, j11, iVar);
            }
        }
    }

    public final void c(long j6) {
        C0885f c0885f = this.f10608c;
        if (c0885f != null && c0885f.f10594a == j6) {
            return;
        }
        C0884e c0884e = this.f10606a;
        this.f10608c = new C0885f(j6, c0884e.f10587a.e(j6), c0884e.f10589c, c0884e.f10590d, c0884e.f10591e, c0884e.f10592f, c0884e.f10593g);
    }
}
