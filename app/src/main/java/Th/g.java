package Th;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public enum g implements m {
    f17272h0(new boolean[0], "BOOLEAN"),
    f17273i0(new byte[0], "BYTE"),
    f17274j0(new short[0], "SHORT"),
    f17275k0(new char[0], "CHARACTER"),
    f17276l0(new int[0], "INTEGER"),
    f17277m0(new long[0], "LONG"),
    f17278n0(new float[0], "FLOAT"),
    f17279o0(new double[0], "DOUBLE");
    

    /* renamed from: Y  reason: collision with root package name */
    public final Object f17281Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f17282Z;

    g(Object obj, String str) {
        this.f17281Y = obj;
        this.f17282Z = r2;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        mVar.n(3);
        mVar.p(188, this.f17282Z);
        mVar.n(176);
        return 1;
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        return this.f17281Y;
    }
}
