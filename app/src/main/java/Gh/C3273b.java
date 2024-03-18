package gh;

import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import wf.k;

/* renamed from: gh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3273b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final k f31632a;

    public C3273b(k kVar) {
        AbstractC3557B.c0("provider", kVar);
        this.f31632a = kVar;
    }

    @Override // gh.c
    public final KSerializer a(List list) {
        AbstractC3557B.c0("typeArgumentsSerializers", list);
        return (KSerializer) this.f31632a.invoke(list);
    }
}
