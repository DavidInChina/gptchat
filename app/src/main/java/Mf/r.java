package Mf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import jh.H1;
import ng.AbstractC4838e;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final C1008q f12101a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1008q f12102b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1008q f12103c;

    /* renamed from: d  reason: collision with root package name */
    public static final C1008q f12104d;

    /* renamed from: e  reason: collision with root package name */
    public static final C1008q f12105e;

    /* renamed from: f  reason: collision with root package name */
    public static final C1008q f12106f;

    /* renamed from: g  reason: collision with root package name */
    public static final C1008q f12107g;

    /* renamed from: h  reason: collision with root package name */
    public static final C1008q f12108h;

    /* renamed from: i  reason: collision with root package name */
    public static final C1008q f12109i;

    /* renamed from: j  reason: collision with root package name */
    public static final Map f12110j;

    /* renamed from: k  reason: collision with root package name */
    public static final C1008q f12111k;

    /* renamed from: l  reason: collision with root package name */
    public static final H1 f12112l = new H1(0);

    /* renamed from: m  reason: collision with root package name */
    public static final H1 f12113m = new H1(1);

    /* renamed from: n  reason: collision with root package name */
    public static final H1 f12114n = new H1(2);

    /* renamed from: o  reason: collision with root package name */
    public static final Hg.s f12115o;

    /* renamed from: p  reason: collision with root package name */
    public static final HashMap f12116p;

    static {
        Hg.s sVar;
        C1008q c1008q = new C1008q(n0.f12095c, 0);
        f12101a = c1008q;
        C1008q c1008q2 = new C1008q(o0.f12096c, 1);
        f12102b = c1008q2;
        C1008q c1008q3 = new C1008q(p0.f12098c, 2);
        f12103c = c1008q3;
        C1008q c1008q4 = new C1008q(k0.f12092c, 3);
        f12104d = c1008q4;
        C1008q c1008q5 = new C1008q(q0.f12100c, 4);
        f12105e = c1008q5;
        C1008q c1008q6 = new C1008q(m0.f12094c, 5);
        f12106f = c1008q6;
        C1008q c1008q7 = new C1008q(j0.f12091c, 6);
        f12107g = c1008q7;
        C1008q c1008q8 = new C1008q(l0.f12093c, 7);
        f12108h = c1008q8;
        C1008q c1008q9 = new C1008q(r0.f12117c, 8);
        f12109i = c1008q9;
        Collections.unmodifiableSet(R4.b.X1(c1008q, c1008q2, c1008q4, c1008q6));
        HashMap hashMap = new HashMap(6);
        hashMap.put(c1008q2, 0);
        hashMap.put(c1008q, 0);
        hashMap.put(c1008q4, 1);
        hashMap.put(c1008q3, 1);
        hashMap.put(c1008q5, 2);
        f12110j = Collections.unmodifiableMap(hashMap);
        f12111k = c1008q5;
        Iterator it = ServiceLoader.load(Hg.s.class, Hg.s.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            sVar = (Hg.s) it.next();
        } else {
            sVar = Hg.r.f7789a;
        }
        f12115o = sVar;
        f12116p = new HashMap();
        f(c1008q);
        f(c1008q2);
        f(c1008q3);
        f(c1008q4);
        f(c1008q5);
        f(c1008q6);
        f(c1008q7);
        f(c1008q8);
        f(c1008q9);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 16) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 16) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i10 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i10) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 == 16) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "from";
        if (i10 == 16) {
        }
        switch (i10) {
        }
        String format2 = String.format(str, objArr);
        if (i10 == 16) {
        }
    }

    public static Integer b(AbstractC1007p abstractC1007p, AbstractC1007p abstractC1007p2) {
        if (abstractC1007p != null) {
            if (abstractC1007p2 != null) {
                t0 t0Var = abstractC1007p.f12097a;
                t0 t0Var2 = abstractC1007p2.f12097a;
                Integer a5 = t0Var.a(t0Var2);
                if (a5 != null) {
                    return a5;
                }
                Integer a10 = t0Var2.a(t0Var);
                if (a10 == null) {
                    return null;
                }
                return Integer.valueOf(-a10.intValue());
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static AbstractC1006o c(H1 h12, AbstractC1006o abstractC1006o, AbstractC1003l abstractC1003l) {
        AbstractC1006o c10;
        if (abstractC1006o != null) {
            if (abstractC1003l != null) {
                for (AbstractC1006o abstractC1006o2 = (AbstractC1006o) abstractC1006o.mo24a(); abstractC1006o2 != null && abstractC1006o2.getVisibility() != f12106f; abstractC1006o2 = (AbstractC1006o) AbstractC4838e.i(abstractC1006o2, AbstractC1006o.class, true)) {
                    if (!abstractC1006o2.getVisibility().a(h12, abstractC1006o2, abstractC1003l)) {
                        return abstractC1006o2;
                    }
                }
                if (!(abstractC1006o instanceof Pf.V) || (c10 = c(h12, ((Pf.Y) ((Pf.V) abstractC1006o)).f14070L0, abstractC1003l)) == null) {
                    return null;
                }
                return c10;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean d(AbstractC1003l abstractC1003l, AbstractC1003l abstractC1003l2) {
        if (abstractC1003l2 != null) {
            W f6 = AbstractC4838e.f(abstractC1003l2);
            if (f6 != W.f12076p) {
                return f6.equals(AbstractC4838e.f(abstractC1003l));
            }
            return false;
        }
        a(7);
        throw null;
    }

    public static boolean e(AbstractC1007p abstractC1007p) {
        if (abstractC1007p != null) {
            if (abstractC1007p != f12101a && abstractC1007p != f12102b) {
                return false;
            }
            return true;
        }
        a(14);
        throw null;
    }

    public static void f(C1008q c1008q) {
        f12116p.put(c1008q.f12097a, c1008q);
    }

    public static AbstractC1007p g(t0 t0Var) {
        if (t0Var != null) {
            AbstractC1007p abstractC1007p = (AbstractC1007p) f12116p.get(t0Var);
            if (abstractC1007p != null) {
                return abstractC1007p;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + t0Var);
        }
        a(15);
        throw null;
    }
}
