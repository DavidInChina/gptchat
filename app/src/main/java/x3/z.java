package x3;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f48761a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48762b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f48763c;

    public /* synthetic */ z(String str, int i10, boolean z10) {
        this.f48761a = i10;
        this.f48763c = z10;
        this.f48762b = str;
    }

    public final String toString() {
        switch (this.f48761a) {
            case 1:
                String str = this.f48762b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
                sb2.append("{");
                sb2.append(str);
                sb2.append("}");
                sb2.append(this.f48763c);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public z(String str, boolean z10) {
        this.f48761a = 1;
        this.f48762b = str;
        this.f48763c = z10;
    }
}
