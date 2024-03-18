package com.openai.experiment;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class s extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final s f27696Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final s f27697Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ s[] f27698h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, com.openai.experiment.s] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.openai.experiment.s] */
    static {
        ?? r22 = new Enum("Uninitialized", 0);
        f27696Y = r22;
        ?? r32 = new Enum("Ready", 1);
        f27697Z = r32;
        s[] sVarArr = {r22, r32};
        f27698h0 = sVarArr;
        AbstractC3557B.C0(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f27698h0.clone();
    }
}
