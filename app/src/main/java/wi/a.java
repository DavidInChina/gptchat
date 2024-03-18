package wi;

/* loaded from: classes.dex */
public abstract class a extends s {
    @Override // wi.s
    public final void f(s sVar) {
        if (sVar instanceof a) {
            this.f48608a = sVar;
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }
}
