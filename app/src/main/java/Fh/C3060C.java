package fh;

import android.gov.nist.javax.sip.header.ParameterNames;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3060C extends AbstractC3075b {

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.serialization.json.a f30799e;

    /* renamed from: f  reason: collision with root package name */
    public final int f30800f;

    /* renamed from: g  reason: collision with root package name */
    public int f30801g = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3060C(AbstractC2904d abstractC2904d, kotlinx.serialization.json.a aVar) {
        super(abstractC2904d);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("value", aVar);
        this.f30799e = aVar;
        this.f30800f = aVar.f37661Y.size();
    }

    @Override // dh.AbstractC2690a0
    public final String O(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return String.valueOf(i10);
    }

    @Override // fh.AbstractC3075b
    public final kotlinx.serialization.json.b R(String str) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        return (kotlinx.serialization.json.b) this.f30799e.f37661Y.get(Integer.parseInt(str));
    }

    @Override // fh.AbstractC3075b
    public final kotlinx.serialization.json.b U() {
        return this.f30799e;
    }

    @Override // ch.AbstractC2430a
    public final int t(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        int i10 = this.f30801g;
        if (i10 < this.f30800f - 1) {
            int i11 = i10 + 1;
            this.f30801g = i11;
            return i11;
        }
        return -1;
    }
}
