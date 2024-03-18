package Wh;

import java.util.regex.Pattern;
import jh.L1;
import ji.AbstractC4137l;
import ji.C4116E;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class E extends F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21144Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final long f21145Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4137l f21146h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f21147i0;

    public E(long j6, u uVar, C4135j c4135j) {
        this.f21147i0 = uVar;
        this.f21145Z = j6;
        this.f21146h0 = c4135j;
    }

    @Override // Wh.F
    public final u a() {
        int i10 = this.f21144Y;
        Object obj = this.f21147i0;
        switch (i10) {
            case 0:
                return (u) obj;
            default:
                String str = (String) obj;
                if (str != null) {
                    Pattern pattern = u.f21259c;
                    return L1.p(str);
                }
                return null;
        }
    }

    public E(String str, long j6, C4116E c4116e) {
        this.f21147i0 = str;
        this.f21145Z = j6;
        this.f21146h0 = c4116e;
    }
}
