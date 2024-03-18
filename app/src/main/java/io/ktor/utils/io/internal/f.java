package io.ktor.utils.io.internal;

import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f33452a;

    /* renamed from: b  reason: collision with root package name */
    public static final Oe.e f33453b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f33454c;

    /* renamed from: d  reason: collision with root package name */
    public static final Ne.b f33455d = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [io.ktor.utils.io.internal.e, Oe.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, Ne.b] */
    static {
        int t02 = AbstractC4344b.t0(4096, "BufferSize");
        f33452a = t02;
        int t03 = AbstractC4344b.t0(2048, "BufferPoolSize");
        int t04 = AbstractC4344b.t0(1024, "BufferObjectPoolSize");
        f33453b = new Oe.e(t03, t02);
        f33454c = new Oe.d(t04);
    }
}
