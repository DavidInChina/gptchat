package dg;

import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;

/* renamed from: dg.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2658G extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C2658G f28292Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0("it", str);
        if (str.length() > 1) {
            return android.gov.nist.core.a.h(TokenNames.f24315L, str, ';');
        }
        return str;
    }
}
