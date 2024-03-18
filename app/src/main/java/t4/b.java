package T4;

/* loaded from: classes2.dex */
public abstract class b implements Comparable {
    /* renamed from: a */
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        Class<?> cls = getClass();
        Class<?> cls2 = bVar.getClass();
        if (cls != cls2) {
            return cls.getName().compareTo(cls2.getName());
        }
        return ((a) this).f16909Y.compareTo(((a) bVar).f16909Y);
    }
}
