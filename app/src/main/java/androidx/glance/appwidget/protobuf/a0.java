package androidx.glance.appwidget.protobuf;

/* loaded from: classes.dex */
public final class a0 implements P {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2042b f25198a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25199b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f25200c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25201d;

    public a0(AbstractC2063x abstractC2063x, String str, Object[] objArr) {
        this.f25198a = abstractC2063x;
        this.f25199b = str;
        this.f25200c = objArr;
        char charAt = str.charAt(0);
        if (charAt < '\ud800') {
            this.f25201d = charAt;
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
                this.f25201d = i10 | (charAt2 << i12);
                return;
            }
        }
    }

    public final AbstractC2042b a() {
        return this.f25198a;
    }

    public final Object[] b() {
        return this.f25200c;
    }

    public final String c() {
        return this.f25199b;
    }

    public final int d() {
        if ((this.f25201d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}
