package x2;

/* renamed from: x2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6266a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48625Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f48626Z;

    public AbstractC6266a() {
        this.f48625Y = 0;
    }

    public static String f(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int h(int i10) {
        return (i10 >> 24) & 255;
    }

    public final void e(int i10) {
        this.f48626Z = i10 | this.f48626Z;
    }

    public final boolean g(int i10) {
        if ((this.f48626Z & i10) == i10) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f48625Y) {
            case 1:
                return f(this.f48626Z);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC6266a(int i10) {
        this(i10, 2);
        this.f48625Y = 2;
    }

    public /* synthetic */ AbstractC6266a(int i10, int i11) {
        this.f48625Y = i11;
        this.f48626Z = i10;
    }
}
