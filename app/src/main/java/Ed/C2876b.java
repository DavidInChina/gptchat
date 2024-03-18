package ed;

import id.AbstractC3557B;
import java.util.Set;
import kotlin.jvm.internal.o;
import wf.k;

/* renamed from: ed.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2876b extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C2876b f29278Y = new o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        Set set = (Set) obj;
        AbstractC3557B.c0("it", set);
        return Boolean.valueOf(!set.isEmpty());
    }
}
