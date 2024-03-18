package p4;

import Wh.C1658c;
import Wh.u;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.regex.Pattern;
import jh.L1;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: p4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5088a extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42712Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ b f42713Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5088a(b bVar, int i10) {
        super(0);
        this.f42712Y = i10;
        this.f42713Z = bVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f42712Y;
        b bVar = this.f42713Z;
        switch (i10) {
            case 0:
                C1658c c1658c = C1658c.f21170n;
                return L1.o(bVar.f42719f);
            default:
                String r10 = bVar.f42719f.r(SIPHeaderNames.CONTENT_TYPE);
                if (r10 != null) {
                    Pattern pattern = u.f21259c;
                    return L1.p(r10);
                }
                return null;
        }
    }
}
