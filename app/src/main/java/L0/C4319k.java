package l0;

/* renamed from: l0.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4319k extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4319k f37714Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AbstractC4324p abstractC4324p = (AbstractC4324p) obj2;
        if (str.length() == 0) {
            return abstractC4324p.toString();
        }
        return str + ", " + abstractC4324p;
    }
}
