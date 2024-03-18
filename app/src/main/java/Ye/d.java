package ye;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f50904a;

    public d(String str) {
        this.f50904a = str;
        if (e.f50907c.b(str)) {
            return;
        }
        throw new Ae.e("Invalid authScheme value: it should be token, but instead it is ".concat(str));
    }

    public abstract String a();

    public final String toString() {
        return a();
    }
}
