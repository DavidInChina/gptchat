package o5;

import A.C0007a0;
import java.util.Map;
import k5.F;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import u5.j;
import y5.g;

/* renamed from: o5.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4918b {

    /* renamed from: a  reason: collision with root package name */
    public static final g f40603a = new g(Q5.c.f14433a);

    /* renamed from: b  reason: collision with root package name */
    public static final F f40604b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static int f40605c = Integer.MAX_VALUE;

    public static final AbstractC5092d a(String str) {
        AbstractC5092d abstractC5092d;
        g gVar = f40603a;
        synchronized (gVar) {
            if (str == null) {
                str = "_dd.sdk_core.default";
            }
            try {
                abstractC5092d = (AbstractC5092d) gVar.f50811b.get(str);
                if (abstractC5092d == null) {
                    P4.a.m0(Q5.c.f14433a, 4, EnumC5090b.f42738Y, new C0007a0(str, 22, new Throwable().fillInStackTrace()), null, false, 56);
                    abstractC5092d = j.f46442a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC5092d;
    }

    public static final boolean b(String str) {
        boolean z10;
        g gVar = f40603a;
        synchronized (gVar) {
            if (str == null) {
                str = "_dd.sdk_core.default";
            }
            try {
                if (((AbstractC5092d) gVar.f50811b.get(str)) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static void c(String str, String str2, Map map, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        a(null).p(str, null, str2, map);
    }
}
