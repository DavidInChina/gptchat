package Ji;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public class q extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final l f9305Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final m f9306Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final n f9307h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ q[] f9308i0;
    /* JADX INFO: Fake field, exist only in values array */
    q EF3;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Enum r32 = new Enum("LOGIC", 0);
        q qVar = new q() { // from class: Ji.h
        };
        q qVar2 = new q() { // from class: Ji.i
        };
        q qVar3 = new q() { // from class: Ji.j
        };
        q qVar4 = new q() { // from class: Ji.k
        };
        l lVar = new l();
        f9305Y = lVar;
        m mVar = new m();
        f9306Z = mVar;
        n nVar = new n();
        f9307h0 = nVar;
        f9308i0 = new q[]{r32, qVar, qVar2, qVar3, qVar4, lVar, mVar, nVar, new q() { // from class: Ji.o
        }, new q() { // from class: Ji.p
        }, new Enum("STRING", 10), new Enum("OBJECT", 11)};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f9308i0.clone();
    }
}
