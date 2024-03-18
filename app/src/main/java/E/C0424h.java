package E;

/* renamed from: E.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424h implements AbstractC0425i, AbstractC0427k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3869a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3870b;

    public C0424h(int i10) {
        this.f3869a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f3870b = 0;
                    return;
                } else {
                    this.f3870b = 0;
                    return;
                }
            }
            this.f3870b = 0;
            return;
        }
        this.f3870b = 0;
    }

    @Override // E.AbstractC0425i
    public final float a() {
        return this.f3870b;
    }

    @Override // E.AbstractC0425i
    public final void b(Z0.b bVar, int i10, int[] iArr, Z0.l lVar, int[] iArr2) {
        Z0.l lVar2 = Z0.l.f22805Y;
        switch (this.f3869a) {
            case 0:
                if (lVar == lVar2) {
                    AbstractC0429m.a(i10, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0429m.a(i10, iArr, iArr2, true);
                    return;
                }
            case 1:
                if (lVar == lVar2) {
                    AbstractC0429m.d(i10, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0429m.d(i10, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (lVar == lVar2) {
                    AbstractC0429m.e(i10, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0429m.e(i10, iArr, iArr2, true);
                    return;
                }
            default:
                if (lVar == lVar2) {
                    AbstractC0429m.f(i10, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0429m.f(i10, iArr, iArr2, true);
                    return;
                }
        }
    }

    @Override // E.AbstractC0427k
    public final void c(Z0.b bVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f3869a) {
            case 0:
                AbstractC0429m.a(i10, iArr, iArr2, false);
                return;
            case 1:
                AbstractC0429m.d(i10, iArr, iArr2, false);
                return;
            case 2:
                AbstractC0429m.e(i10, iArr, iArr2, false);
                return;
            default:
                AbstractC0429m.f(i10, iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.f3869a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
