package qh;

import K4.C0813a;

/* renamed from: qh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5328b implements AbstractC5329c {

    /* renamed from: c  reason: collision with root package name */
    public static final AbstractC5327a f44137c;

    /* renamed from: a  reason: collision with root package name */
    public final Q4.a f44138a;

    /* renamed from: b  reason: collision with root package name */
    public final R4.a f44139b;

    static {
        AbstractC5327a abstractC5327a;
        try {
            try {
                try {
                    abstractC5327a = new U3.c(R4.b.class.getMethod("translate", P4.a.class, O4.a.class, byte[].class, R4.a.class, Q4.a.class, S4.b.class), 27, P4.a.class.getConstructor(new Class[0]));
                } catch (Throwable th2) {
                    abstractC5327a = new C0813a(th2.getMessage(), 8, 0);
                }
            } catch (Throwable unused) {
                abstractC5327a = new U3.e(R4.b.class.getMethod("translate", O4.a.class, byte[].class, R4.a.class, Q4.a.class, S4.b.class), Q4.a.class.getField("targetApiLevel"));
            }
        } catch (Throwable unused2) {
            abstractC5327a = new U3.e(R4.b.class.getMethod("translate", O4.a.class, byte[].class, R4.a.class, Q4.a.class, S4.b.class), Q4.a.class.getField("a"));
        }
        f44137c = abstractC5327a;
    }

    public C5328b(Q4.a aVar, R4.a aVar2) {
        this.f44138a = aVar;
        this.f44139b = aVar2;
    }
}
