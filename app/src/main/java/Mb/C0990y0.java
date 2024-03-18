package Mb;

import android.content.Intent;
import wf.AbstractC6216a;

/* renamed from: Mb.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0990y0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0990y0 f12004Y = new kotlin.jvm.internal.o(0);

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        return intent;
    }
}
