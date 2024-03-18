package eg;

import Uf.D;
import dg.AbstractC2652A;
import dg.y;
import java.security.AccessControlException;
import java.util.HashMap;
import kg.C4290b;
import kg.C4291c;

/* renamed from: eg.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2898f implements AbstractC2652A {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f29394j;

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f29395k;

    /* renamed from: a  reason: collision with root package name */
    public int[] f29396a;

    /* renamed from: b  reason: collision with root package name */
    public String f29397b;

    /* renamed from: c  reason: collision with root package name */
    public int f29398c;

    /* renamed from: d  reason: collision with root package name */
    public String f29399d;

    /* renamed from: e  reason: collision with root package name */
    public String[] f29400e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f29401f;

    /* renamed from: g  reason: collision with root package name */
    public String[] f29402g;

    /* renamed from: h  reason: collision with root package name */
    public EnumC2893a f29403h;

    /* renamed from: i  reason: collision with root package name */
    public String[] f29404i;

    static {
        try {
            f29394j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f29394j = false;
        }
        HashMap hashMap = new HashMap();
        f29395k = hashMap;
        hashMap.put(C4290b.j(new C4291c("kotlin.jvm.internal.KotlinClass")), EnumC2893a.f29380j0);
        hashMap.put(C4290b.j(new C4291c("kotlin.jvm.internal.KotlinFileFacade")), EnumC2893a.f29381k0);
        hashMap.put(C4290b.j(new C4291c("kotlin.jvm.internal.KotlinMultifileClass")), EnumC2893a.f29383m0);
        hashMap.put(C4290b.j(new C4291c("kotlin.jvm.internal.KotlinMultifileClassPart")), EnumC2893a.f29384n0);
        hashMap.put(C4290b.j(new C4291c("kotlin.jvm.internal.KotlinSyntheticClass")), EnumC2893a.f29382l0);
    }

    @Override // dg.AbstractC2652A
    public final y b(C4290b c4290b, Rf.a aVar) {
        EnumC2893a enumC2893a;
        C4291c b10 = c4290b.b();
        if (b10.equals(D.f17726a)) {
            return new C2896d(this, 0, 0);
        }
        if (b10.equals(D.f17740o)) {
            return new C2896d(this, 1, 0);
        }
        if (f29394j || this.f29403h != null || (enumC2893a = (EnumC2893a) f29395k.get(c4290b)) == null) {
            return null;
        }
        this.f29403h = enumC2893a;
        return new C2896d(this, 2, 0);
    }

    @Override // dg.AbstractC2652A
    public final void a() {
    }
}
