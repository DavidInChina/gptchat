package d7;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class x extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final x f28122Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ x[] f28123Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [d7.x, java.lang.Enum, java.lang.Object] */
    static {
        ?? r62 = new Enum("DEFAULT", 0);
        f28122Y = r62;
        Enum r72 = new Enum("UNMETERED_ONLY", 1);
        Enum r82 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r92 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r10 = new Enum("NEVER", 4);
        Enum r11 = new Enum("UNRECOGNIZED", 5);
        f28123Z = new x[]{r62, r72, r82, r92, r10, r11};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r62);
        sparseArray.put(1, r72);
        sparseArray.put(2, r82);
        sparseArray.put(3, r92);
        sparseArray.put(4, r10);
        sparseArray.put(-1, r11);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f28123Z.clone();
    }
}
