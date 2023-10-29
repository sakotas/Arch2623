# coding: utf-8

"""
    Заказ ресурсов на облаке

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 0.0.1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class Cloud(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'cloud_id': 'str',
        'id_client': 'str',
        'os': 'str',
        'ram': 'str',
        'cpu': 'str'
    }

    attribute_map = {
        'cloud_id': 'cloud_id',
        'id_client': 'id_client',
        'os': 'OS',
        'ram': 'RAM',
        'cpu': 'CPU'
    }

    def __init__(self, cloud_id=None, id_client=None, os=None, ram=None, cpu=None):  # noqa: E501
        """Cloud - a model defined in Swagger"""  # noqa: E501
        self._cloud_id = None
        self._id_client = None
        self._os = None
        self._ram = None
        self._cpu = None
        self.discriminator = None
        if cloud_id is not None:
            self.cloud_id = cloud_id
        self.id_client = id_client
        self.os = os
        self.ram = ram
        self.cpu = cpu

    @property
    def cloud_id(self):
        """Gets the cloud_id of this Cloud.  # noqa: E501


        :return: The cloud_id of this Cloud.  # noqa: E501
        :rtype: str
        """
        return self._cloud_id

    @cloud_id.setter
    def cloud_id(self, cloud_id):
        """Sets the cloud_id of this Cloud.


        :param cloud_id: The cloud_id of this Cloud.  # noqa: E501
        :type: str
        """

        self._cloud_id = cloud_id

    @property
    def id_client(self):
        """Gets the id_client of this Cloud.  # noqa: E501


        :return: The id_client of this Cloud.  # noqa: E501
        :rtype: str
        """
        return self._id_client

    @id_client.setter
    def id_client(self, id_client):
        """Sets the id_client of this Cloud.


        :param id_client: The id_client of this Cloud.  # noqa: E501
        :type: str
        """
        if id_client is None:
            raise ValueError("Invalid value for `id_client`, must not be `None`")  # noqa: E501

        self._id_client = id_client

    @property
    def os(self):
        """Gets the os of this Cloud.  # noqa: E501

        Операционная система сервера  # noqa: E501

        :return: The os of this Cloud.  # noqa: E501
        :rtype: str
        """
        return self._os

    @os.setter
    def os(self, os):
        """Sets the os of this Cloud.

        Операционная система сервера  # noqa: E501

        :param os: The os of this Cloud.  # noqa: E501
        :type: str
        """
        if os is None:
            raise ValueError("Invalid value for `os`, must not be `None`")  # noqa: E501
        allowed_values = ["Windows", "Linux"]  # noqa: E501
        if os not in allowed_values:
            raise ValueError(
                "Invalid value for `os` ({0}), must be one of {1}"  # noqa: E501
                .format(os, allowed_values)
            )

        self._os = os

    @property
    def ram(self):
        """Gets the ram of this Cloud.  # noqa: E501

        Объем оперативной памяти  # noqa: E501

        :return: The ram of this Cloud.  # noqa: E501
        :rtype: str
        """
        return self._ram

    @ram.setter
    def ram(self, ram):
        """Sets the ram of this Cloud.

        Объем оперативной памяти  # noqa: E501

        :param ram: The ram of this Cloud.  # noqa: E501
        :type: str
        """
        if ram is None:
            raise ValueError("Invalid value for `ram`, must not be `None`")  # noqa: E501

        self._ram = ram

    @property
    def cpu(self):
        """Gets the cpu of this Cloud.  # noqa: E501

        Количество ядер процессора  # noqa: E501

        :return: The cpu of this Cloud.  # noqa: E501
        :rtype: str
        """
        return self._cpu

    @cpu.setter
    def cpu(self, cpu):
        """Sets the cpu of this Cloud.

        Количество ядер процессора  # noqa: E501

        :param cpu: The cpu of this Cloud.  # noqa: E501
        :type: str
        """
        if cpu is None:
            raise ValueError("Invalid value for `cpu`, must not be `None`")  # noqa: E501

        self._cpu = cpu

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(Cloud, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Cloud):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
