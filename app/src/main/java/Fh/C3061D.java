package fh;

import android.gov.nist.javax.sip.header.ParameterNames;
import eh.AbstractC2904d;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import java.util.List;
import kf.AbstractC4268D;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3061D extends C3059B {

    /* renamed from: j  reason: collision with root package name */
    public final kotlinx.serialization.json.c f30802j;

    /* renamed from: k  reason: collision with root package name */
    public final List f30803k;

    /* renamed from: l  reason: collision with root package name */
    public final int f30804l;

    /* renamed from: m  reason: collision with root package name */
    public int f30805m = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3061D(AbstractC2904d abstractC2904d, kotlinx.serialization.json.c cVar) {
        super(abstractC2904d, cVar, null, null);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("value", cVar);
        this.f30802j = cVar;
        List K22 = kf.t.K2(cVar.f37662Y.keySet());
        this.f30803k = K22;
        this.f30804l = K22.size() * 2;
    }

    @Override // fh.C3059B, dh.AbstractC2690a0
    public final String O(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return (String) this.f30803k.get(i10 / 2);
    }

    @Override // fh.C3059B, fh.AbstractC3075b
    public final kotlinx.serialization.json.b R(String str) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        if (this.f30805m % 2 == 0) {
            return AbstractC2911k.b(str);
        }
        return (kotlinx.serialization.json.b) AbstractC4268D.Z0(str, this.f30802j);
    }

    @Override // fh.C3059B, fh.AbstractC3075b
    public final kotlinx.serialization.json.b U() {
        return this.f30802j;
    }

    @Override // fh.C3059B
    public final kotlinx.serialization.json.c W() {
        return this.f30802j;
    }

    @Override // fh.C3059B, fh.AbstractC3075b, ch.AbstractC2430a
    public final void b(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
    }

    @Override // fh.C3059B, ch.AbstractC2430a
    public final int t(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        int i10 = this.f30805m;
        if (i10 < this.f30804l - 1) {
            int i11 = i10 + 1;
            this.f30805m = i11;
            return i11;
        }
        return -1;
    }
}
