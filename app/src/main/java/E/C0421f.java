package E;

/* renamed from: E.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421f implements AbstractC0425i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3862a;

    @Override // E.AbstractC0425i
    public final float a() {
        switch (this.f3862a) {
            case 6:
                return 0;
            default:
                return 0;
        }
    }

    @Override // E.AbstractC0425i
    public final void b(Z0.b bVar, int i10, int[] iArr, Z0.l lVar, int[] iArr2) {
        Z0.l lVar2 = Z0.l.f22805Y;
        switch (this.f3862a) {
            case 6:
                if (lVar == lVar2) {
                    AbstractC0429m.c(i10, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0429m.b(iArr, iArr2, true);
                    return;
                }
            default:
                if (lVar == lVar2) {
                    AbstractC0429m.b(iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0429m.c(i10, iArr, iArr2, true);
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.f3862a) {
            case 6:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
