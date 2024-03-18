package zh;

import java.util.Arrays;
import xh.AbstractC6458a;
import yh.EnumC6628o;
import yh.X;

/* renamed from: zh.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6887o implements AbstractC6869C {
    @Override // zh.AbstractC6869C
    public C6871E d() {
        return e();
    }

    public final v g(String str, Class cls, AbstractC6458a... abstractC6458aArr) {
        int i10 = 0;
        for (xh.c cVar : Arrays.asList(abstractC6458aArr)) {
            i10 = (i10 & (~cVar.b())) | cVar.a();
        }
        return a(str, EnumC6628o.a(cls, X.f50977Y), i10);
    }
}
