package S4;

/* loaded from: classes2.dex */
public enum g {
    TYPE_HEADER_ITEM(0, "header_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_STRING_ID_ITEM(1, "string_id_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_TYPE_ID_ITEM(2, "type_id_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PROTO_ID_ITEM(3, "proto_id_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_FIELD_ID_ITEM(4, "field_id_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_METHOD_ID_ITEM(5, "method_id_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_CLASS_DEF_ITEM(6, "class_def_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_CALL_SITE_ID_ITEM(7, "call_site_id_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_METHOD_HANDLE_ITEM(8, "method_handle_item"),
    TYPE_MAP_LIST(4096, "map_list"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_TYPE_LIST(4097, "type_list"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(4098, "annotation_set_ref_list"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ENCODED_ARRAY_ITEM(4099, "annotation_set_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8192, "class_data_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ENCODED_ARRAY_ITEM(8193, "code_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8194, "string_data_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ENCODED_ARRAY_ITEM(8195, "debug_info_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8196, "annotation_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ENCODED_ARRAY_ITEM(8197, "encoded_array_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8198, "annotations_directory_item"),
    TYPE_MAP_ITEM(-1, "map_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_TYPE_ITEM(-1, "type_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_EXCEPTION_HANDLER_ITEM(-1, "exception_handler_item"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATION_SET_REF_ITEM(-1, "annotation_set_ref_item");
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f16160Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f16161Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f16162h0;

    g(int i10, String str) {
        this.f16160Y = i10;
        this.f16161Z = str;
        this.f16162h0 = (str.endsWith("_item") ? str.substring(0, str.length() - 5) : str).replace('_', ' ');
    }
}
