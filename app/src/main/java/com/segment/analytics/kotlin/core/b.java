package com.segment.analytics.kotlin.core;

import dh.AbstractC2688N;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class b extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public static final b f27810d = new AbstractC2688N(C.f37623a.b(a.class));

    @Override // dh.AbstractC2688N
    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        String str;
        AbstractC3557B.c0("element", bVar);
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) AbstractC2911k.g(bVar).get("type");
        if (bVar2 != null) {
            str = AbstractC2911k.h(bVar2).r();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -907689876:
                    if (str.equals("screen")) {
                        return ScreenEvent.Companion.serializer();
                    }
                    break;
                case -135762164:
                    if (str.equals("identify")) {
                        return IdentifyEvent.Companion.serializer();
                    }
                    break;
                case 92902992:
                    if (str.equals("alias")) {
                        return AliasEvent.Companion.serializer();
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        return GroupEvent.Companion.serializer();
                    }
                    break;
                case 110621003:
                    if (str.equals("track")) {
                        return TrackEvent.Companion.serializer();
                    }
                    break;
            }
        }
        throw new Exception("Unknown Event: key 'type' not found or does not matches any event type");
    }
}
