package Vc;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class v extends r {

    /* renamed from: b  reason: collision with root package name */
    public final int f18562b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18563c;

    /* renamed from: d  reason: collision with root package name */
    public final String f18564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10, String str, String str2, Throwable th2) {
        super(th2);
        AbstractC3557B.c0(ParameterNames.CAUSE, th2);
        this.f18562b = i10;
        this.f18563c = str;
        this.f18564d = str2;
    }

    public /* synthetic */ v(Error error, int i10, String str, int i11) {
        this(i10, (String) null, (i11 & 8) != 0 ? null : str, error);
    }
}
