package B1;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public Object f1725a;

    public abstract boolean a();

    public final boolean b(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            l lVar = (l) this.f1725a;
            if (lVar == null) {
                return a();
            }
            int a5 = lVar.a(i10, charSequence);
            if (a5 == 0) {
                return true;
            }
            if (a5 != 1) {
                return a();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }
}
