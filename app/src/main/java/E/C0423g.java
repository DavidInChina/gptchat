package E;

/* renamed from: E.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423g implements AbstractC0427k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3868a;

    @Override // E.AbstractC0427k
    public final float a() {
        switch (this.f3868a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override // E.AbstractC0427k
    public final void c(Z0.b bVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f3868a) {
            case 0:
                AbstractC0429m.c(i10, iArr, iArr2, false);
                return;
            default:
                AbstractC0429m.b(iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.f3868a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
