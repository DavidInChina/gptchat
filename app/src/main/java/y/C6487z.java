package y;

import Z.l1;

/* renamed from: y.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6487z extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50316Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f50317Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6460A f50318h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6487z(wf.k kVar, C6460A c6460a, int i10) {
        super(1);
        this.f50316Y = i10;
        this.f50317Z = kVar;
        this.f50318h0 = c6460a;
    }

    public final Integer a(int i10) {
        long j6;
        long j10;
        Z0.l lVar = Z0.l.f22805Y;
        int i11 = this.f50316Y;
        long j11 = 0;
        wf.k kVar = this.f50317Z;
        C6460A c6460a = this.f50318h0;
        switch (i11) {
            case 0:
                int d10 = (int) (C6460A.d(c6460a) >> 32);
                long a5 = c6460a.f50079b.a(Ng.H.c(i10, i10), C6460A.d(c6460a), lVar);
                int i12 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf(d10 - ((int) (a5 >> 32))));
            case 1:
                long a10 = c6460a.f50079b.a(Ng.H.c(i10, i10), C6460A.d(c6460a), lVar);
                int i13 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf((-((int) (a10 >> 32))) - i10));
            case 2:
                int d11 = (int) (C6460A.d(c6460a) & 4294967295L);
                long a11 = c6460a.f50079b.a(Ng.H.c(i10, i10), C6460A.d(c6460a), lVar);
                int i14 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf(d11 - ((int) (a11 & 4294967295L))));
            case 3:
                long a12 = c6460a.f50079b.a(Ng.H.c(i10, i10), C6460A.d(c6460a), lVar);
                int i15 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf((-((int) (a12 & 4294967295L))) - i10));
            case 4:
                l1 l1Var = (l1) c6460a.f50082e.get(c6460a.f50078a.f51386c.getValue());
                if (l1Var != null) {
                    j6 = ((Z0.k) l1Var.getValue()).f22804a;
                } else {
                    j6 = 0;
                }
                long a13 = c6460a.f50079b.a(Ng.H.c(i10, i10), j6, lVar);
                int i16 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf((-((int) (a13 >> 32))) - i10));
            case 5:
                l1 l1Var2 = (l1) c6460a.f50082e.get(c6460a.f50078a.f51386c.getValue());
                if (l1Var2 != null) {
                    j11 = ((Z0.k) l1Var2.getValue()).f22804a;
                }
                long j12 = j11;
                long a14 = c6460a.f50079b.a(Ng.H.c(i10, i10), j12, lVar);
                int i17 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf((-((int) (a14 >> 32))) + ((int) (j12 >> 32))));
            case 6:
                l1 l1Var3 = (l1) c6460a.f50082e.get(c6460a.f50078a.f51386c.getValue());
                if (l1Var3 != null) {
                    j10 = ((Z0.k) l1Var3.getValue()).f22804a;
                } else {
                    j10 = 0;
                }
                long a15 = c6460a.f50079b.a(Ng.H.c(i10, i10), j10, lVar);
                int i18 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf((-((int) (a15 & 4294967295L))) - i10));
            default:
                l1 l1Var4 = (l1) c6460a.f50082e.get(c6460a.f50078a.f51386c.getValue());
                if (l1Var4 != null) {
                    j11 = ((Z0.k) l1Var4.getValue()).f22804a;
                }
                long j13 = j11;
                long a16 = c6460a.f50079b.a(Ng.H.c(i10, i10), j13, lVar);
                int i19 = Z0.i.f22798c;
                return (Integer) kVar.invoke(Integer.valueOf((-((int) (a16 & 4294967295L))) + ((int) (j13 & 4294967295L))));
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f50316Y) {
            case 0:
                return a(((Number) obj).intValue());
            case 1:
                return a(((Number) obj).intValue());
            case 2:
                return a(((Number) obj).intValue());
            case 3:
                return a(((Number) obj).intValue());
            case 4:
                return a(((Number) obj).intValue());
            case 5:
                return a(((Number) obj).intValue());
            case 6:
                return a(((Number) obj).intValue());
            default:
                return a(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6487z(C6460A c6460a, wf.k kVar, int i10) {
        super(1);
        this.f50316Y = i10;
        this.f50318h0 = c6460a;
        this.f50317Z = kVar;
    }
}
