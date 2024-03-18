package fh;

import android.gov.nist.javax.sip.header.ParameterNames;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3098y extends AbstractC3075b {

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.serialization.json.b f30902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3098y(AbstractC2904d abstractC2904d, kotlinx.serialization.json.b bVar) {
        super(abstractC2904d);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("value", bVar);
        this.f30902e = bVar;
        this.f28433a.add("primitive");
    }

    @Override // fh.AbstractC3075b
    public final kotlinx.serialization.json.b R(String str) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        if (str == "primitive") {
            return this.f30902e;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // fh.AbstractC3075b
    public final kotlinx.serialization.json.b U() {
        return this.f30902e;
    }

    @Override // ch.AbstractC2430a
    public final int t(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return 0;
    }
}
