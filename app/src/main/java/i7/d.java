package i7;

import U3.u;
import android.content.Context;
import g7.AbstractC3205b;
import j7.C3912b;
import j7.EnumC3915e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m7.AbstractC4565a;

/* loaded from: classes.dex */
public final class d implements AbstractC3205b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32745a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32746b;

    public /* synthetic */ d(p000if.a aVar, int i10) {
        this.f32745a = i10;
        this.f32746b = aVar;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f32745a;
        p000if.a aVar = this.f32746b;
        switch (i10) {
            case 0:
                AbstractC4565a abstractC4565a = (AbstractC4565a) aVar.get();
                U3.c cVar = new U3.c(14);
                b7.c cVar2 = b7.c.f25648Y;
                u uVar = new u(25);
                Set emptySet = Collections.emptySet();
                if (emptySet != null) {
                    uVar.f17494i0 = emptySet;
                    uVar.f17492Z = 30000L;
                    uVar.f17493h0 = 86400000L;
                    ((Map) cVar.f17397h0).put(cVar2, uVar.i());
                    b7.c cVar3 = b7.c.f25650h0;
                    u uVar2 = new u(25);
                    Set emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        uVar2.f17494i0 = emptySet2;
                        uVar2.f17492Z = 1000L;
                        uVar2.f17493h0 = 86400000L;
                        ((Map) cVar.f17397h0).put(cVar3, uVar2.i());
                        b7.c cVar4 = b7.c.f25649Z;
                        u uVar3 = new u(25);
                        Set emptySet3 = Collections.emptySet();
                        if (emptySet3 != null) {
                            uVar3.f17494i0 = emptySet3;
                            uVar3.f17492Z = 86400000L;
                            uVar3.f17493h0 = 86400000L;
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC3915e.f36041Z)));
                            if (unmodifiableSet != null) {
                                uVar3.f17494i0 = unmodifiableSet;
                                ((Map) cVar.f17397h0).put(cVar4, uVar3.i());
                                cVar.f17396Z = abstractC4565a;
                                if (abstractC4565a != null) {
                                    if (((Map) cVar.f17397h0).keySet().size() >= b7.c.values().length) {
                                        cVar.f17397h0 = new HashMap();
                                        return new C3912b((AbstractC4565a) cVar.f17396Z, (Map) cVar.f17397h0);
                                    }
                                    throw new IllegalStateException("Not all priorities have been configured");
                                }
                                throw new NullPointerException("missing required property: clock");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            default:
                String packageName = ((Context) aVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
