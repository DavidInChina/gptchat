package Ph;

/* loaded from: classes.dex */
public abstract class a {
    public a(int i10) {
        if (i10 != 589824 && i10 != 524288 && i10 != 458752 && i10 != 393216 && i10 != 327680 && i10 != 262144 && i10 != 17432576) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported api ", i10));
        }
    }

    public abstract a a();

    public abstract void b(char c10);

    public abstract a c();

    public abstract void e(String str);

    public abstract void f();

    public abstract a g();

    public abstract void h(String str);

    public abstract void i(String str);

    public abstract a j();

    public abstract a k();

    public abstract a l();

    public abstract a m();

    public abstract a n();

    public abstract a o(char c10);

    public abstract void p();

    public abstract void q(String str);
}
