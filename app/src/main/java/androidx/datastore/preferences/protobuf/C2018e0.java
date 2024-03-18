package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2018e0 implements T {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2011b f25045a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25046b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f25047c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25048d;

    public C2018e0(AbstractC2040z abstractC2040z, String str, Object[] objArr) {
        this.f25045a = abstractC2040z;
        this.f25046b = str;
        this.f25047c = objArr;
        char charAt = str.charAt(0);
        if (charAt < '\ud800') {
            this.f25048d = charAt;
            return;
        }
        int i10 = charAt & '\u1fff';
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= '\ud800') {
                i10 |= (charAt2 & '\u1fff') << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.f25048d = i10 | (charAt2 << i12);
                return;
            }
        }
    }

    public final AbstractC2011b a() {
        return this.f25045a;
    }

    public final Object[] b() {
        return this.f25047c;
    }

    public final String c() {
        return this.f25046b;
    }

    public final int d() {
        if ((this.f25048d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}
